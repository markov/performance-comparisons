package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_182 {
    private val production = Production29_182("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}