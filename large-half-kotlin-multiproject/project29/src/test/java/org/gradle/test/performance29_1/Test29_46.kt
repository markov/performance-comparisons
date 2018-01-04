package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_46 {
    private val production = Production29_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}