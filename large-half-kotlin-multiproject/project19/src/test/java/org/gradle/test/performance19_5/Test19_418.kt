package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_418 {
    private val production = Production19_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}