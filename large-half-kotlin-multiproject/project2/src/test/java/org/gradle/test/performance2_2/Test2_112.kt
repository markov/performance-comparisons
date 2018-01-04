package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_112 {
    private val production = Production2_112("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}