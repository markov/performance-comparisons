package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_475 {
    private val production = Production19_475("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}