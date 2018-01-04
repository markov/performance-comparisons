package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_498 {
    private val production = Production22_498("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}