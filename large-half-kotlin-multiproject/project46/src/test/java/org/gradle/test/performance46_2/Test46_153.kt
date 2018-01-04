package org.gradle.test.performance46_2

import org.junit.Assert.*

class Test46_153 {
    private val production = Production46_153("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
