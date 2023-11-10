package info.jukov.mockitobugtest

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
interface TestInterface {

    fun foo(): Int
}

@RunWith(AndroidJUnit4::class)
class MockitoBugTest {

    @Mock
    private val testInterface: TestInterface = mock(TestInterface::class.java)

    @Before
    fun setup() {
        Mockito.`when`(testInterface.foo()).thenReturn(42)
    }

    @Test
    fun foo() {
        println("Success")
    }
}