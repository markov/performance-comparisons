package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_335 {
    private val production = Production29_335("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}