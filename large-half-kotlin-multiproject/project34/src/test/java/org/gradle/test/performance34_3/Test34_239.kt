package org.gradle.test.performance34_3

import org.junit.Assert.*

class Test34_239 {
    private val production = Production34_239("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}