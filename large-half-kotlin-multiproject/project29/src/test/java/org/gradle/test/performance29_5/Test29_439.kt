package org.gradle.test.performance29_5

import org.junit.Assert.*

class Test29_439 {
    private val production = Production29_439("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}