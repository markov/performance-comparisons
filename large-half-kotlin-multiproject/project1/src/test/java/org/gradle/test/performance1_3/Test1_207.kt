package org.gradle.test.performance1_3

import org.junit.Assert.*

class Test1_207 {
    private val production = Production1_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}