package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_171 {
    private val production = Production29_171("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}