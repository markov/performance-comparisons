package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_336 {
    private val production = Production29_336("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}