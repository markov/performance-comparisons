package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_475 {
    private val production = Production22_475("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}