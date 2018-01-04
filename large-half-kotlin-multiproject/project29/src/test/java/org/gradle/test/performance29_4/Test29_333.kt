package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_333 {
    private val production = Production29_333("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}