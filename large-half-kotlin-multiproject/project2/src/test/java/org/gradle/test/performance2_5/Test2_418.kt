package org.gradle.test.performance2_5

import org.junit.Assert.*

class Test2_418 {
    private val production = Production2_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}